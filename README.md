# spring-boot-blog-rest-api


tips in writing method in springboot  restapi

1.create method on service<br>
2.create implementation<br>3.implement on controller


endpoints:<br>
*Post* (baseUrl/api/posts)  = create post<br>
*Get* (baseUrl/api/posts) = get all post<br>
        baseUrl/api/posts?pageNo=0&pageSize=2<br>
*Get* (baseUrl/api/posts/id) = get 1 post with id<br>
*Put*(baseUrl/api/posts/id) = update 1 post using id


Pagination:<br>
private List<Post> content;<br>
private int pageNo;<br>
private int pageSize;<br>
private long totalElements;<br>
private int totalPages;<br>
private boolean last;<br>