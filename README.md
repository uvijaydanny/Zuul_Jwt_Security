# Zuul_Jwt_Security
1. Register all these services with a Eurekha naming server
2. Send POST request to auth service with proper credentials
URL - http://localhost:8762/auth
Body - {
	"username":"admin",
	"password":"admin"	
}
or danny/password
3. Upon receiving a token use it in the subsequent request to gallery service to fetch the data
GET URL - http://localhost:8762/gallery/img
Headers - Authorization Bearer xxxxTOKENxxxx





