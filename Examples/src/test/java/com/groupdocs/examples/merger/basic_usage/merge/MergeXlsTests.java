package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeXlsTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeXls.run(SampleFiles.SAMPLE_XLS, SampleFiles.SAMPLE_XLS);
        Assertions.assertThat(result).isNotNull().exists();
    }
}