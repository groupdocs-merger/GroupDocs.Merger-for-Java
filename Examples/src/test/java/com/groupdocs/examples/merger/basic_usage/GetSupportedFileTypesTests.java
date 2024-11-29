package com.groupdocs.examples.merger.basic_usage;

import com.groupdocs.examples.merger.TestsSetUp;
import com.groupdocs.merger.domain.FileType;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.List;

class GetSupportedFileTypesTests extends TestsSetUp {


    @Test
    void testRun() {
        List<FileType> result = GetSupportedFileTypes.run();
        Assertions.assertThat(result).isNotNull();
    }
}