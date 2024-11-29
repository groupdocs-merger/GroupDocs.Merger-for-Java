package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeOdsTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeOds.run(SampleFiles.SAMPLE_ODS, SampleFiles.SAMPLE_ODS);
        Assertions.assertThat(result).isNotNull().exists();
    }
}