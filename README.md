# spring-boot-blog-rest-api


tips in writing method in springboot  restapi<br>
0.create entity(model and fields including relation)<br>
1.create and extend repositories<br>
2.create method on service<br>
3.create implementation from impl folder<br>
4.import repository in service impl then generate constructor<br>5.create convertion entity to dto viseVersa<br>
6.implement rest method on controller


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