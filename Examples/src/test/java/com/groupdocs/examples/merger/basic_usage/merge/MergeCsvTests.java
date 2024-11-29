package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeCsvTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeCsv.run(SampleFiles.SAMPLE_CSV, SampleFiles.SAMPLE_CSV);
        Assertions.assertThat(result).isNotNull().exists();
    }
}