package com.siro.lamdaExample;

import com.amazonaws.serverless.proxy.internal.testutils.AwsProxyRequestBuilder;
import com.amazonaws.serverless.proxy.internal.testutils.MockLambdaContext;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import com.amazonaws.services.lambda.runtime.Context;
import com.siro.lamdaExample.lamda.LambdaHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class LamdaHandlerTest {
    @Test
    void whenTheUsersPathIsInvokedViaLambda_thenShouldReturnAList() throws IOException {
        LambdaHandler lambdaHandler = new LambdaHandler();
        AwsProxyRequest req = new AwsProxyRequestBuilder("/api/v1/users", "GET").build();
        Context context = new MockLambdaContext();
        AwsProxyResponse resp = lambdaHandler.handleRequest(req, context);
        Assertions.assertNotNull(resp.getBody());
        Assertions.assertEquals(200, resp.getStatusCode());
    }
}
