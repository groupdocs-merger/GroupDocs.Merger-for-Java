package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeVstmTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeVstm.run(SampleFiles.SAMPLE_VSTM, SampleFiles.SAMPLE_VSTM);
        Assertions.assertThat(result).isNotNull().exists();
    }
}