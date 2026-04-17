package com.edureka.wallet.api;

import com.edureka.wallet.model.PaymentTransactionDto;
import com.edureka.wallet.model.WalletDto;


public interface WalletService {
   //payment bug fixed
	WalletDto doTransaction(PaymentTransactionDto transaction);

	WalletDto getBalance(String emailId);

}
