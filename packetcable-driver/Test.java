/**
 @header@
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.net.Socket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

// jcops
import org.umu.cops.common.*;
import org.umu.cops.stack.*;
import org.umu.cops.prpdp.COPSPdpException;

//pcmm
import org.pcmm.PCMMDef;
import org.pcmm.PCMMPdpAgent;
import org.pcmm.PCMMPdpDataProcess;
import org.pcmm.rcd.IPCMMPolicyServer;
import org.pcmm.rcd.impl.PCMMPolicyServer;


import org.pcmm.PCMMGlobalConfig;
import org.pcmm.gates.IAMID;
import org.pcmm.gates.IClassifier;
import org.pcmm.gates.IGateSpec;
import org.pcmm.gates.IGateSpec.DSCPTOS;
import org.pcmm.gates.IGateSpec.Direction;
import org.pcmm.gates.IPCMMGate;
import org.pcmm.gates.ISubscriberID;
import org.pcmm.gates.ITrafficProfile;
import org.pcmm.gates.ITransactionID;
import org.pcmm.gates.impl.AMID;
import org.pcmm.gates.impl.Classifier;
import org.pcmm.gates.impl.DOCSISServiceClassNameTrafficProfile;
import org.pcmm.gates.impl.GateSpec;
import org.pcmm.gates.impl.PCMMGateReq;
import org.pcmm.gates.impl.SubscriberID;
import org.pcmm.gates.impl.TransactionID;
import org.pcmm.messages.IMessage;
import org.pcmm.messages.impl.MessageFactory;
import org.pcmm.objects.MMVersionInfo;
import org.pcmm.state.IState;
import org.pcmm.PCMMPdpMsgSender;
import org.pcmm.PCMMPdpAgent;
import org.pcmm.PCMMGlobalConfig;




public class Test {
    public static void addFlow(	PCMMPdpMsgSender sender, int num ) {
        System.out.println("Add Flow " + num);
        try {
            //pcmm_sender.sendGateSet();
            sender.sendGateSetDemo(num);
        } catch (COPSPdpException e) {
            System.out.println("Failed to sendGateSet, reason: " + e.getMessage());
        }

    }

    public static void deleteFlow( PCMMPdpMsgSender sender, int num, int id ) {

        if ( id != 0 ) {
            System.out.println("Remove Flow " + num);
            try {
                sender.sendGateDelete( id );
            } catch (COPSPdpException e) {
                System.out.println("Failed to sendGateDelete, reason: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        byte[] data = "Hello World".getBytes();
        Test program = new Test();
        program.start();

    }

    public void start() {
        System.out.println("Test - starting Client");
        Scanner in = new Scanner(System.in);
        PCMMPdpDataProcess process;
        PCMMPdpAgent lpdp;
        PCMMPdpAgent rpdp;
        PCMMPdpAgent pcmm_pdp;
        PCMMPdpMsgSender pcmm_sender;

        IPCMMPolicyServer ps = new PCMMPolicyServer();
        IPCMMPolicyServer lps = new PCMMPolicyServer();

        process = new PCMMPdpDataProcess();
        lpdp = new PCMMPdpAgent(PCMMDef.C_PCMM, process) ;
        rpdp = new PCMMPdpAgent(PCMMDef.C_PCMM, process) ;
        pcmm_pdp = new PCMMPdpAgent(PCMMDef.C_PCMM, process) ;
        int toggle = 1;
        boolean quit = false;
        int menuItem;
        do {
            // print menu
            System.out.println("MENU         ");
            System.out.println("=============");
            // System.out.println("1. CMTS+requestCMTSConnection+gateSet");
            System.out.println("1. Add Flow 1");
            System.out.println("2. Add Flow 2");
            // System.out.println("2. CMTS+PCMMPdpAgent.connect+PCMMPdpMsgSender Add Flow");
            System.out.println("3. Toggle Flow");
            System.out.println("4. Remove Flow 1");
            System.out.println("5. Remove Flow 2");
/*
            System.out.println("6. Localhost Open");
            System.out.println("7. localhost+requestCMTSConnection+gateSet");
            System.out.println("8. Remote Open");
            System.out.println("9. localhost+PCMMPdpAgent.connect+PCMMMsgPdpSender Add Flow");
*/
            System.out.println("0. Quit");
            // handle user commands
            System.out.print("Enter Choice: ");
            menuItem = in.nextInt();
            switch (menuItem) {
            case 14:
                System.out.println("Open and Add Flow 1");
                try  {
                    pcmm_pdp.connect( PCMMGlobalConfig.DefaultCMTS, 3918 );
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                pcmm_sender = new PCMMPdpMsgSender (PCMMDef.C_PCMM, pcmm_pdp.getClientHandle(), pcmm_pdp.getSocket());
                try {
                    pcmm_sender.sendGateDelete(12936 );
                    pcmm_sender.sendGateDelete(29316 );
                } catch (COPSPdpException e) {
                    System.out.println("Failed to sendGateSet, reason: " + e.getMessage());
                }

            case 12:
                System.out.println( "Toggle =  " +   toggle);
                System.out.println( "GateID1 = " +   PCMMGlobalConfig.getGateID1() );
                System.out.println( "GateID2 = " +   PCMMGlobalConfig.getGateID2() );
		break;
            case 11:
                System.out.println( "GateID1 = " +   PCMMGlobalConfig.getGateID1() );
		PCMMGlobalConfig.setGateID1(33333) ;
                System.out.println( "GateID1 = " +   PCMMGlobalConfig.getGateID1() );
		break;
		
            case 10:
                System.out.println("Open and Add Flow 1");
                ps.requestCMTSConnection(PCMMGlobalConfig.DefaultCMTS);
                ps.gateSet();
                break;
            case 1:
                System.out.println("Open and Add Flow 1");
                try  {
                    pcmm_pdp.connect( PCMMGlobalConfig.DefaultCMTS, 3918 );
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                pcmm_sender = new PCMMPdpMsgSender (PCMMDef.C_PCMM, pcmm_pdp.getClientHandle(), pcmm_pdp.getSocket());
                try {
                    //pcmm_sender.sendGateSet();
                    pcmm_sender.sendGateSetBestEffortWithExtendedClassifier();
                } catch (COPSPdpException e) {
                    System.out.println("Failed to sendGateSet, reason: " + e.getMessage());
                }
                break;
            case 2:
                System.out.println("Open and Add Flow 2");
                try  {
                    pcmm_pdp.connect( PCMMGlobalConfig.DefaultCMTS, 3918 );
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                pcmm_sender = new PCMMPdpMsgSender (PCMMDef.C_PCMM, pcmm_pdp.getClientHandle(), pcmm_pdp.getSocket());
                try {
                    //pcmm_sender.sendGateSet();
                    pcmm_sender.sendGateSetBestEffortWithExtendedClassifier();
                } catch (COPSPdpException e) {
                    System.out.println("Failed to sendGateSet, reason: " + e.getMessage());
                }
                break;
            case 3:
                System.out.println("Toggle Flow");
                pcmm_sender = new PCMMPdpMsgSender (PCMMDef.C_PCMM, pcmm_pdp.getClientHandle(), pcmm_pdp.getSocket());
                toggle = 3 - toggle;
		addFlow(pcmm_sender, toggle );
		if ( toggle == 1 )
		deleteFlow(pcmm_sender, toggle,PCMMGlobalConfig.getGateID2()  );
		else
		deleteFlow(pcmm_sender, toggle,PCMMGlobalConfig.getGateID1()  );
	


                break;
            case 4:
                System.out.println("Remove Flow 1");
                try  {
                    pcmm_pdp.connect( PCMMGlobalConfig.DefaultCMTS, 3918 );
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                pcmm_sender = new PCMMPdpMsgSender (PCMMDef.C_PCMM, pcmm_pdp.getClientHandle(), pcmm_pdp.getSocket());
                try {
                    pcmm_sender.sendGateDelete( PCMMGlobalConfig.getGateID1() );
                } catch (COPSPdpException e) {
                    System.out.println("Failed to sendGateSet, reason: " + e.getMessage());
                }


                break;
            case 5:
                System.out.println("Remove Flow 2");
                try  {
                    pcmm_pdp.connect( PCMMGlobalConfig.DefaultCMTS, 3918 );
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                pcmm_sender = new PCMMPdpMsgSender (PCMMDef.C_PCMM, pcmm_pdp.getClientHandle(), pcmm_pdp.getSocket());
                try {
                    pcmm_sender.sendGateDelete( PCMMGlobalConfig.getGateID2() );
                } catch (COPSPdpException e) {
                    System.out.println("Failed to sendGateSet, reason: " + e.getMessage());
                }
                break;
            case 6:
                System.out.println("Localhost Open");
                try  {
                    lpdp.connect( "localhost", 3918 );
                } catch (Exception e) {

                    System.out.println(e.getMessage());
                }
                break;
            case 7:
                System.out.println("localhost+requestCMTSConnection+gateSet");
                // ps.requestCMTSConnection(PCMMGlobalConfig.DefaultCMTS);
                // socket_id = ps.requestCMTSConnection("10.32.4.232");
                lps.requestCMTSConnection("127.0.0.1");
                lps.gateSet();
                break;
            case 8:
                System.out.println("Remote Open connect");
                try  {
                    pcmm_pdp.connect( PCMMGlobalConfig.DefaultCMTS, 3918 );
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 9:
                System.out.println("Localhost Open connect");
                try  {
                    lpdp.connect( "localhost", 3918 );
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                PCMMPdpMsgSender pcmm_sender2 =
                    new PCMMPdpMsgSender ( PCMMDef.C_PCMM, lpdp.getClientHandle(), lpdp.getSocket());
                try {
                    pcmm_sender2.sendGateSet();
                } catch (COPSPdpException e) {
                    System.out.println("Failed to sendGateSet, reason: " + e.getMessage());
                }
                break;
            case 0:
                quit = true;
                pcmm_sender = new PCMMPdpMsgSender (PCMMDef.C_PCMM, pcmm_pdp.getClientHandle(), pcmm_pdp.getSocket());
		deleteFlow(pcmm_sender, 2, PCMMGlobalConfig.getGateID2());
		deleteFlow(pcmm_sender, 1, PCMMGlobalConfig.getGateID1());
                try {
                try {
                    if (lpdp.isConnected()) lpdp.disconnect(lpdp.getPepIdString(), null);
                    if (rpdp.isConnected()) rpdp.disconnect(rpdp.getPepIdString(), null);
                    if (pcmm_pdp.isConnected()) pcmm_pdp.disconnect(pcmm_pdp.getPepIdString(), null);
                } catch (COPSException e) {
                    System.out.println("Failed to disconnect, reason: " + e.getMessage());
                }
                } catch (IOException e) {
                    System.out.println("Failed to disconnect, reason: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid choice.");
            }
        } while (!quit);
    }
}



