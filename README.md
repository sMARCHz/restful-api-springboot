## RESTful Webservices
### What is REST?
REST stands for **Representational State Transfer**. It is the architecture style which use to create web services. It mostly uses with HTTP protocol because both of them were designed by a same person Roy Fielding.   
Note: REST isn't standard or specification.

It was designed for internet-scale usage. So, the coupling between client and server must be lightweight (loose) as possible to facilitate large-scale adoption.  The core building blocks of RESTful systems are **resources**.

### What is resources?
A resource can be anything that is accessed by URL you supply such as a web page, a video stream, an image, or a list of data. The only real constraint is that **every resource in a system is uniquely identifiable**.

Every time the client requests a resource using URI, the server always responds with **representation** of the resource which client can choose the representation they prefer to interact with.  
There are multiple type of the representation. The two popular representations that people use are JSON and XML.

### Architectural properties
REST is kind of rules or constraints. It consists of these following
1. Performance
2. Scalability
3. Simplicity
4. Modifiability
5. Visibility
6. Portability
7. Reliability

### Architecture constraints
The REST architecture style define 6 guiding constraint (1 optional)
1. **Client-server architecture**  
   ตัว client หรือ ui นั้นอยู่แยกจาก server ดังนั้นจึงเป็นอิสระต่อกันและสามารถ scale ได้ง่าย
2. **Statelessness**  
   เซิร์ฟเวอร์จะไม่พึ่งพาข้อมูลจาก request ครั้งก่อนมาใช้ ดังนั้นจึงสามารถลด load ของ server ส่งผลให้มีประสิทธิภาพดีขึ้น
3. **Cacheability**  
   สามารถ cache response ได้ โดย response นั้นต้องสามารถกำหนดได้ว่าอันไหน cache ได้ไม่ได้ เพื่อป้องกันไม่ให้ client ได้รับข้อมูลเก่าไป
4. **Layered system**  
   client ไม่จำเป็นต้องรู้ว่า request นั้นผ่านตัวกลางอะไรมาบ้าง ทำให้เราสามารถเพิ่ม load balancer หรือ security และอื่นๆลงไปได้โดยไม่กระทบการสื่อสาร
5. **Uniform Interface** (important)  
   สามารถคุยกับ server ได้ โดยไม่กำหนดประเภทอุปกรณ์หรือประเภทแอปพลิเคชัน ซึ่งจะสามารถแยกได้อีก 4 constraints ได้แก่
    - Resource identification in requests
    - Resource manipulation through representations
    - Self-descriptive messages
    - Hypermedia as the engine of application state (HATEOAS)
6. **Code on demand** (optional)  
   server สามารถขยายหรือปรับแต่งฟังก์ชันของ client ได้โดยการส่งโค้ดไปรัน

### What is Restful Web Services?
It's simple. Restful Web Services (RWS) is the web service which implement the REST paradigm. That's all.

________
### HTTP vs REST
REST and HTTP aren't the same thing. Both of them are independent of each other.
- We can implement REST with other communication protocols instead of HTTP.
- We also can use HTTP without REST architecture style.

### JSON vs XML
- JSON (JavaScript Object Notation)
```
{
    "age" : 24,
    "name" : {
        "firstName" : "John",
        "lastName" : "Doe"
    },
    "contact" : [
        "abc@mail.com",
        "012-345-6789"
    ]
}
```
- XML (Extensible Markup Language)
```
<user>
    <age>24</age>
    <name>
        <firstName>John</firstName>
        <lastName>Doe</lastName>
    </name>
    <contact>
        <value>abc@mail.com</value>
        <value>012-345-6789</value>
    </contact>
</user>
```
Note: XML doesn't have array.
