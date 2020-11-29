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
  

    @Autowired
    public SMSCommandKey(SendCommand sendCommand) {
    	this.sendCommand=sendCommand;
    	
    	commandMap.put(BankConstants.SEND, this.sendCommand);
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
