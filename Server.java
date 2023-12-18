import java.io.*;
import java.net.*;
class Server
{
    ServerSocket server;
    Socket socket;

    BufferedReader br;
    PrintWriter out;
    // construnctor
    public Server(){

        try{

            server=new ServerSocket(7777);
            System.out.println("server is ready to accept connection");
            System.out.println("waiting");
            socket=server.accept();

            // for transmission connection pipe is created
            br=new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out=new PrintWriter(socket.getOutputStream());

            startReading();
            startWriting();

        }catch(Exception e){
            e.printStackTrace();

        }

    }

    // here we must use multi threading concept ... in wchich one thread to read data and another to thread to write the data
    public void startReading(){
        // thread to read the data. -- using runnable interface

        Runnable r1=()->{
            System.out.println("Reader started...");
            
            while (true) {

                try{

                    String msg=br.readLine();

                    if(msg.equals("exit")){
                        System.out.println("client terminated the chat ");
                        break;

                    }

                    System.out.println("Client : "+ msg);

                }
                catch(Exception e){
                    e.printStackTrace();
                }               
            }

        };

        new Thread(r1).start();

    }

    public void startWriting(){

        // thread to take data from user and send to the client
        Runnable r2=()->{
            System.out.println("writer started");

            while (true) {
                try{

                    // to take msg from console use BufferReader

                   BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
                   String content =br1.readLine();
                   out.println(content);
                   out.flush();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                
            }

        };
        new Thread(r2).start();

    }

    public static void main(String[] args) {
        System.out.println("this is server... going to start server");
        new Server();

    }
}