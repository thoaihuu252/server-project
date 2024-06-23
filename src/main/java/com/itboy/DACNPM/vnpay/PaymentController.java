package com.itboy.DACNPM.vnpay;

import com.itboy.DACNPM.models.Payment;
import com.itboy.DACNPM.responses.ResponseObject;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.prefix}/payment")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;
    @GetMapping("/vn-pay")
    public ResponseObject<PaymentDTO.VNPayResponse> pay(HttpServletRequest request) {
        return new ResponseObject<>(HttpStatus.OK, "Success", paymentService.createVnPayPayment(request));
    }
    @GetMapping("/vn-pay-callback")
    public ResponseObject<PaymentDTO.VNPayResponse> payCallbackHandler(HttpServletRequest request) {
        String status = request.getParameter("vnp_ResponseCode");
        String orderInfo = request.getParameter("vnp_OrderInfo");
        if (status.equals("00")) {
            paymentService.savePayment(orderInfo,"Success");
            return new ResponseObject<>(HttpStatus.OK, "Success", new PaymentDTO.VNPayResponse("00", orderInfo, ""));
        } else {
            paymentService.savePayment(orderInfo,"Failed");
            return new ResponseObject<>(HttpStatus.BAD_REQUEST, "Failed", null);
        }
    }
    @GetMapping("check-result")
    public ResponseObject<PaymentDTO.ResultResponse> checkResult( @RequestParam("name") String name) {
        Payment payment = paymentService.getPayment(name);
        String namePayment = payment.getName();
        String message = payment.getResult();
        if (payment != null){
            return new ResponseObject<>(HttpStatus.OK, "Success",new PaymentDTO.ResultResponse(namePayment,message));
        } else {
            return new ResponseObject<>(HttpStatus.BAD_REQUEST, "Failed", null);
        }
    }
}