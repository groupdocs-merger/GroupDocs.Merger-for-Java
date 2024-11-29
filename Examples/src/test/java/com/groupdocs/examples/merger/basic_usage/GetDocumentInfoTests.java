package com.groupdocs.examples.merger.basic_usage;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import com.groupdocs.merger.domain.result.IDocumentInfo;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

class GetDocumentInfoTests extends TestsSetUp {


    @Test
    void testRun() {
        IDocumentInfo result = GetDocumentInfo.run(SampleFiles.SAMPLE_VSDX);
        Assertions.assertThat(result).isNotNull();
    }
}