package main.java.JourneyToJava005;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


class Block{
    String timeStamp, preHash, data, curHash;

    Block(String data, ArrayList<Block> chain) throws NoSuchAlgorithmException {
        this.timeStamp = getTimeStamp();
        if (chain.size() == 0){
            this.preHash = "0000000000000000000000000000000000000000000000000000000000000000";
        }else {
            this.preHash = chain.get(chain.size() - 1).curHash;
        }
        this.data = data;
        this.curHash = calcCurrentHash(this.timeStamp+this.preHash+this.data);
    }

    private String getTimeStamp(){
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }

    private String calcCurrentHash(String data) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashInBytes = md.digest(data.getBytes(StandardCharsets.UTF_8));

        // bytes to hex
        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

}


public class BlockChain{
    public static ArrayList <Block> chain = new ArrayList<>();

    public static void main(String[] args) throws NoSuchAlgorithmException {
        for (int i=0; i<5; i++) {

            String data = String.format("My Journey to Java By 0xIslamTaha : part %d", i);

            Block block_obj = new Block(data, chain);
            chain.add(block_obj);
            System.out.println(chain.get(i).preHash);
            System.out.println(chain.get(i).data);
            System.out.println(chain.get(i).timeStamp);
            System.out.println(chain.get(i).curHash);
            System.out.println("\n");
        }
    }

}

