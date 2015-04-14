## Laboratorio de pruebas Microservices, Docker, nginx, Spring boot, Akka, HTTP Async: ###
- microservicio MathOpts (Sumar, restar, dividir, multiplicar)
	ejemplo: Request GET /sum/1/1
		Response {'opt':'1+1','result':2}

- microservicio EnglishDic (palabra -> descripcion)
	ejemplo: Request GET /dic/breakfast
		Response {'word':'breakfast', 'descp':'fist meal of the day'}

- webservices con  MathOpts + EnglishDic (Simulando un servicio que consume otros servicios)
	ejemplo: Request GET /dic/breakfast/sum/1/1
		Response {'dic':{'word':'breakfast','descp':'first meal of the day'},'mathOpt':{'opt':'1+1','result':2}}


