package com.github.foskel.douglas.plugin.scan;

/**
 * @author Foskel
 */
public class PluginScanFailedException extends RuntimeException {
    public PluginScanFailedException(String message) {
        super(message);
    }

    public PluginScanFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
