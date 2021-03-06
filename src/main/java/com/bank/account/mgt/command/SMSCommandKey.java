package com.bank.account.mgt.command;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank.account.mgt.constants.BankConstants;
import com.bank.account.mgt.controller.impl.SMSHandlerImpl;

/**
 * {@link SMSCommandKey} has one method which is consumed by {@link SMSHandlerImpl}.
 * It acts as gateway to identify the command.
 *
 */
@Component
public class SMSCommandKey {

	private Map<String, ICommand> commandMap = new HashMap<>();

	private SendCommand sendCommand;
	private TotalSentCommand totalSentCommand;
	private BalanceCommand balanceCommand;
  

    @Autowired
    public SMSCommandKey(SendCommand sendCommand, BalanceCommand balanceCommand, TotalSentCommand totalSentCommand) {
    	this.sendCommand=sendCommand;
    	this.totalSentCommand=totalSentCommand;
    	this.balanceCommand = balanceCommand;
    	commandMap.put(BankConstants.SEND, this.sendCommand);
    	commandMap.put(BankConstants.TOTAL_SENT, this.totalSentCommand);
    	commandMap.put(BankConstants.BALANCE, this.balanceCommand);
    }
	
	
	/**
	 * It gives respective command object based on input command key.
	 * 
	 * @param key
	 * @return - It sends back respective command object.
	 * 
	 * 
	 */
	public ICommand getCommand(String key) {
		return commandMap.get(key);
	}

}
