/**
 * Copyright (C) 2015, 2016 GPL V2
 * 
 * This file is free to use: you can redistribute it and/or modify it under the terms of the GPL General Public License
 * V2 as published by the Free Software Foundation, subject to the following conditions:
 * 
 * The above copyright notice should never be changed and should always included wherever this file is used.
 * The Below mentioned author name should always included wherever this file is used.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY.
 * See the GNU General Public License V2 for more details.
 */
package com.study.common.util;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Utility for file operations.
 * 
 * @author SANJAY
 *
 */
public final class FileUtil {
    private static final Logger LOGGER = LogManager.getLogger(FileUtil.class);

    /**
     * Private Constructor to avoid object creation.
     */
    private FileUtil() {

    }
    
    /**
     * Used to check whether it is a valid file or directory, required for file/direcory operations.
     * @param file file to check whether it is file or directory.
     * @return true if file is a file or false if file is a directory.
     * @throws Exception if file is neither a file nor a directory.
     */
    //FIXME Throw custom exception with proper message.
    private static boolean isFile(final File file) throws Exception {
        LOGGER.trace("Invoking isFile...");
        if(file != null && file.exists()) {
            if(file.isFile()) {
                return true;
            } else if (file.isDirectory()) {
                return false;
            }
        }
        LOGGER.error("File or Direcotry is invalid to perform operation.");
        throw new Exception();
    }

}
