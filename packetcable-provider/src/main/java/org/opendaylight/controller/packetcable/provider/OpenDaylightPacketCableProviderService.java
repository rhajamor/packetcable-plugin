package org.opendaylight.controller.packetcable.provider;

import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.traffic.profile.rev140808.TrafficProfileBestEffortAttributes;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.traffic.profile.rev140808.add.flow.input.instructions.instruction.instruction.apply.actions._case.apply.actions.action.action.flowspec._case.Flowspec;
import org.pcmm.gates.ITrafficProfile;
import org.pcmm.gates.impl.Classifier;

public interface OpenDaylightPacketCableProviderService { 
	
	public ITrafficProfile	buildTrafficProfile(TrafficProfileBestEffortAttributes bestEffort);

	public ITrafficProfile	buildTrafficProfile(Flowspec bestEffort);
	
	public Classifier getClassifier();

}
