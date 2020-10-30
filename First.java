class First{
public static void main(String args[])
{
System.out.println("Hello Java");
}
}
http://www.uobabylon.edu.iq/download/M.S%202013-2014/Operating_System_Concepts,_8th_Edition%5BA4%5D.pdf




[5:00 PM] Sukhvinder Singh
  //postman (using)  //get the payload  var decoder = new StringDecoder('utf-8');  var buffer = '';  req.on('data',function(data){?????    buffer += decoder.write(data);  }?????);    req.on('end',function(){?????    buffer += decoder.end();    res.statusCode = 200;    res.setHeader('Content-Type','text/plain');    res.end('Hello World');  //console.log('Request received on path:  ' +trimpath+ '    method is: ' +method+ ' with the query string  ', queryStringObject); console.log('received: ', buffer);  }?????);    //end of payload portion 
