package io.altar.jseprojectp2.utils.exceptions;

public class DisallowMofificationAttributeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DisallowMofificationAttributeException() {
		super("Disallow Modification Attribute");
	}

	public DisallowMofificationAttributeException(String message) {
		super(message);
	}

}
