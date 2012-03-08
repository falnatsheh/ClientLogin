## ClientLogin

Java helper class to retrieve authentication token from google. 

### Methods
 1- `String getAuthToken(String accountType, String email,String password, String service, String source)`
 
 Sends a Post request to retrieve authentication token. if there's error null will be return.
 
 2- `String getAuthToken(String email,String password, String service, String source)`
 
 Sends a Post request to retrieve authentication token, defult the accountType to "HOSTED_OR_GOOGLE".  if there's error null will be return.