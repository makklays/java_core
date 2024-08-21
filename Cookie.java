
// Cookie 

Cookie sessionId = new Cookie("session_id", request.remoteAddr() + new Date().toString());

// add
response.addCookie(sessionId);

response.setContentType("text/html");

// get 
Cookie[] cookies = request.getCookies();
for (int i = 0; i < cookies.length; i++) {
  System.out.println("Name: " + cookies[i].getName());
  System.out.println("Value: " + cookies[i].getValue());
}

// methods 
public void setDomain(String pattern) - устанавливает домен 
public String getDomain() - возвращает домен запроса 
public void setValue(String newValue) - устанавливает значение куки 
public String getValue() - возвращает значение куки 
public String getName() - возвращает имя cookie
public void setMaxAge(int expiry) - устанавливает максимальное время куки 
public int getMaxAge() - возвращает максимальное время в секундах 
public void setPath(String uri) - устанавливает путь 
public String getPath() - возращает путь 
public void setSecure(boolean flag) - использовать защищенное соединение 
public void setComment(String purpose) - устанавливает комментарий 
public String getComment() - возвращает комментарий 

