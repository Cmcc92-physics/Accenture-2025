package io.altar.jseprojectp2.textinterface.states;

import io.altar.jseprojectp2.utils.scannerUtils.ScannerUtils;

public abstract class State {
	public static final ScannerUtils scanner = new ScannerUtils();
	
	public abstract int on();


}
