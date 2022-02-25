package StreamTask;

public class Response {
    private String responseBody;
    private int statusCode;
    private String responseType;

    public Response(){

    }
    public Response(String responseBody, int statusCode, String responseType) {
        this.responseBody = responseBody;
        this.statusCode = statusCode;
        this.responseType = responseType;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }
}
