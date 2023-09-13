class caller implements Runnable{
string msg;
caller target;
thread t;rad
public caller(call me targ,string s){
target=targ;
msg=s;
t=new Thread(this)
t.start ();
}