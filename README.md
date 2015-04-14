## Laboratorio de pruebas Microservices, Docker, nginx, Spring boot, Akka, HTTP Async: ###
- microservicio MathOpts (Sumar, restar, dividir, multiplicar)
	ejemplo: Request GET /add/1/1
		Response {'opt':'1+1','result':2}

- microservicio Words (operacion -> palabra -> resultado)
	ejemplo: Request GET /count/breakfast
		Response {'operation':'count', 'result':'9'}

- webservices con  MathOpts + Words (Simulando un servicio que consume otros servicios)
	ejemplo: Request GET /count/breakfast/add/1/1
		Response {'words':{'operation':'count','result':'9'},'mathOpt':{'operation':'1+1','result':2}}


