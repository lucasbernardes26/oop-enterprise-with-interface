package model.services;

public interface OnlinePaymentService {
    //Taxa de pagamento
    public Double paymentFee(Double amount);

    //Taxa de juros
    public Double interest(Double amount, Integer months);

}
