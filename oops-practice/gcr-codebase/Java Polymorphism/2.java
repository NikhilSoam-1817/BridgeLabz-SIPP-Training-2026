class Notification{
    String recipientName,message;

    Notification(String r,String m){
        recipientName=r;
        message=m;
    }

    void sendNotification(){}
}

class EmailNotification extends Notification{
    EmailNotification(String r,String m){
        super(r,m);
    }

    @Override
    void sendNotification(){
        System.out.println("Email sent to "+recipientName+" with message: "+message);
    }
}

class SMSNotification extends Notification{
    SMSNotification(String r,String m){
        super(r,m);
    }

    @Override
    void sendNotification(){
        System.out.println("SMS sent to "+recipientName+" with message: "+message);
    }
}

class Main{
    public static void main(String[] args){
        Notification[] n={
            new EmailNotification("Ram","Hi"),
            new SMSNotification("Shyam","Hello")
        };

        for(Notification x:n)
            x.sendNotification();
    }
}