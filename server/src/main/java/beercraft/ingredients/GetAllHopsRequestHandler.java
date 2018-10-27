package beercraft.ingredients;

import beercraft.util.GetAllQuery;
import beercraft.util.RequestData;
import beercraft.util.RequestHandler;
import beercraft.util.Response;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class GetAllHopsRequestHandler implements RequestHandler {
    /**
     * Handles a request that was dispatched by the main Lambda handler.
     *
     * @param requestData The request body and query parameters
     * @return The response
     */
    public Response handleRequest(RequestData requestData) throws IOException {
        AmazonDynamoDB databaseClient = AmazonDynamoDBClientBuilder.defaultClient();
        GetAllQuery<Hops> query = new GetAllQuery<>(databaseClient, Hops.class);

        List<Hops> output = query.execute();

        ObjectMapper mapper = new ObjectMapper();
        return new Response(output);
    }
}
