

import java.io.IOException;
import java.util.Random;

import org.umu.cops.common.*;
import org.pcmm.PCMMPepAgent;
import org.pcmm.PCMMDef;
import org.umu.cops.stack.COPSError;

import org.pcmm.rcd.ICMTS;
import org.pcmm.rcd.IPCMMPolicyServer;
import org.pcmm.rcd.impl.CMTS;
import org.pcmm.rcd.impl.PCMMPolicyServer;


class Main {
    public static void main(String[] args){
        String nodeId = new String("00:02:fc:84:08:1a");
        byte[] sourceMac = new byte[6];
        System.out.printf("0x%02X%02X%02X%02X%02X%02X\n",
                                                sourceMac[0],
                                                sourceMac[1],
                                                sourceMac[2],
                                                sourceMac[3],
                                                sourceMac[4],
                                                sourceMac[5]);
        System.out.println("Main - starting Server");
//      System.out.println(args[0]);
        int port = 3918;
	Random ran = new Random();
	Integer PepId = new Integer(ran.nextInt(1000) + 50000);

	ICMTS icmts = new CMTS();
	icmts.startServer();
/*
	PCMMPepAgent cmts = new PCMMPepAgent(PCMMDef.C_PCMM);
	try  {
	   cmts.run();
	} catch (Exception e) {
		
        	System.out.println(e.getMessage());
	}
*/
    }
}
