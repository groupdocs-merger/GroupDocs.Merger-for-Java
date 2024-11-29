package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeHtmlTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeHtml.run(SampleFiles.SAMPLE_HTML, SampleFiles.SAMPLE_HTML);
        Assertions.assertThat(result).isNotNull().exists();
    }
}