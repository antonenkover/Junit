package com.payment;

import org.junit.Before;
import org.junit.Test;

public class PaymentServiceTest2 {
    private PaymentService instance;

    @Before
    public void setUp () {
        instance = new PaymentService();
    }

    @Test
    public void shouldReturnRandomResultValues() {
        for (int i = 0; i < 66; i++)
            System.out.println(instance.getPaymentResult());
    }

}