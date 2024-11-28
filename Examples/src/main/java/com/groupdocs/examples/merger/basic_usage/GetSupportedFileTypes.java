package com.groupdocs.examples.merger.basic_usage;


import com.groupdocs.merger.domain.FileType;

import java.util.List;

/**
 * This example demonstrates how to obtain all supported file types.
 */
public class GetSupportedFileTypes {
    public static List<FileType> run() {
        List<FileType> fileTypes = FileType.getSupportedFileTypes();
        final StringBuffer stringBuffer = new StringBuffer();
        for (FileType fileType : fileTypes) {
            stringBuffer.append(fileType.getFileFormat()).append(" (").append(fileType.getExtension()).append("), ");
        }
        stringBuffer.delete(stringBuffer.length() - 2, stringBuffer.length() - 1);
        System.out.println(stringBuffer);

        System.out.println("..sample finished successfully.");
        return fileTypes;
    }
}