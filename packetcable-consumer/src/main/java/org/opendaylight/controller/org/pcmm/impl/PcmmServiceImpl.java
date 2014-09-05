package org.opendaylight.controller.org.pcmm.impl;

import org.opendaylight.controller.org.pcmm.api.PcmmService;

public abstract class PcmmServiceImpl implements PcmmService {

//	private static final Logger log = LoggerFactory.getLogger(PcmmServiceImpl.class);
//	private final ListeningExecutorService executor = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());
//	private PacketcableServiceService packetcableServiceService;
//	private List<IpAddress> cmtsList;
//	private Map<CmtsReference, IPSCMTSClient> cmtsClients;
//	private IPCMMPolicyServer policyServer;
//
//	public PcmmServiceImpl(PacketcableServiceService packetcableServiceService) {
//		this.packetcableServiceService = packetcableServiceService;
//		policyServer = new PCMMPolicyServer();
//		cmtsClients = Maps.newConcurrentMap();
//		cmtsList = Lists.newArrayList();
//	}
//
//	@Override
//	public void onCmtsAdded(CmtsAdded notification) {
//		String ipv4 = notification.getId().getIpv4Address().getValue();
//		IPSCMTSClient client = policyServer.requestCMTSConnection(ipv4);
//		if (client.isConnected()) {
//			cmtsClients.put(notification.getCmtsRef(), client);
//			cmtsList.add(notification.getId());
//		}
//	}
//
//	@Override
//	public void onCmtsRemoved(CmtsRemoved notification) {
//		if (cmtsList.contains(notification.getId()))
//			cmtsList.remove(notification.getId());
//		if (cmtsClients.containsKey(notification.getCmtsRef())) {
//			IPSCMTSClient client = cmtsClients.remove(notification.getCmtsRef());
//			client.disconnect();
//		}
//	}
//
//	@Override
//	public void onCmtsUpdated(CmtsUpdated notification) {
//		// TODO
//	}
//
//	@Override
//	public Boolean sendGateDelete() {
//		// TODO change me
//		boolean ret = true;
//		for (Iterator<IPSCMTSClient> iter = cmtsClients.values().iterator(); iter.hasNext();)
//			ret &= cmtsClients.get(0).gateDelete();
//		return ret;
//	}
//
//	@Override
//	public Boolean sendGateSynchronize() {
//		boolean ret = true;
//		for (Iterator<IPSCMTSClient> iter = cmtsClients.values().iterator(); iter.hasNext();)
//			ret &= cmtsClients.get(0).gateSynchronize();
//		return ret;
//	}
//
//	@Override
//	public Boolean sendGateInfo() {
//		boolean ret = true;
//		for (Iterator<IPSCMTSClient> iter = cmtsClients.values().iterator(); iter.hasNext();)
//			ret &= cmtsClients.get(0).gateInfo();
//		return ret;
//	}
//
//	@Override
//	public Boolean sendGateSet() {
//		boolean ret = true;
//		for (Iterator<IPSCMTSClient> iter = cmtsClients.values().iterator(); iter.hasNext();)
//			ret &= cmtsClients.get(0).gateSet();
//		return ret;
//	}
}
