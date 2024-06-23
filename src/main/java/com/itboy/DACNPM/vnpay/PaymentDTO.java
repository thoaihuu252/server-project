package com.itboy.DACNPM.vnpay;

import lombok.Builder;

public abstract class PaymentDTO {
    @Builder
    public static class VNPayResponse {
        public String code;
        public String message;
        public String paymentUrl;
    }
    @Builder
    public static class ResultResponse {
        public String name;
        public String message;
    }
}