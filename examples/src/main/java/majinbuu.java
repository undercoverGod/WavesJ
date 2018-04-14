import com.wavesplatform.wavesj.Account;
import com.wavesplatform.wavesj.Node;
import com.wavesplatform.wavesj.PrivateKeyAccount;

import java.io.IOException;
import java.net.URISyntaxException;

public class majinbuu {
    private static final String MAINNET_NODE="https://nodes.wavesnodes.com";

    public static void main(String[] args) throws URISyntaxException, IOException {

        String seed="your seed here";
        PrivateKeyAccount jha=PrivateKeyAccount.fromSeed(seed,0, Account.MAINNET);
        String address=jha.getAddress();
        System.out.println(address);

        Node node=new Node(MAINNET_NODE);
        System.out.println("height of mainnet "+node.getHeight());
        System.out.println("my balance is "+node.getBalance(address));
        System.out.println("alan balance:"+node.getBalance(address,));




    }
}

