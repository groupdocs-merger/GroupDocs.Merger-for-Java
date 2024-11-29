package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeTsvTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeTsv.run(SampleFiles.SAMPLE_TSV, SampleFiles.SAMPLE_TSV);
        Assertions.assertThat(result).isNotNull().exists();
    }
}