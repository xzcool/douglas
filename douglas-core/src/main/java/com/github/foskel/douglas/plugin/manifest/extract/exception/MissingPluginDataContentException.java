package com.github.foskel.douglas.plugin.manifest.extract.exception;

/**
 * @author Foskel
 */
public class MissingPluginDataContentException extends RuntimeException {
    public MissingPluginDataContentException(String message) {
        super(message);
    }

    public MissingPluginDataContentException(String message,
                                             Throwable cause) {
        super(message, cause);
    }
}