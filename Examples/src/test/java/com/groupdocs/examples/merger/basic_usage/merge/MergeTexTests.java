package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeTexTests extends TestsSetUp {


    @Test
    @Ignore("GroupDocsMergerException: Index: -1, Size: 0")
    void testRun() {
        Path result = MergeTex.run(SampleFiles.SAMPLE_TEX, SampleFiles.SAMPLE_TEX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}