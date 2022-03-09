package question3;

public class TvRemoteMain {
public static void main(String[] args) {
	TvRemote bplTv=new BPLTv();
	bplTv.home();
	bplTv.volume();
	bplTv.keyInputs();
	bplTv.changeChannels();
	
	TvRemote panasonicTv=new PanasonicTv();
	panasonicTv.home();
	panasonicTv.volume();
	panasonicTv.keyInputs();
	panasonicTv.changeChannels();
	
	TvRemote sonyTv=new SonyTv();
	sonyTv.home();
	sonyTv.volume();
	sonyTv.keyInputs();
	sonyTv.changeChannels();
	
	
}
}
