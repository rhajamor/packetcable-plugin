package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateSetInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateSynchronizeInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateSynchronizeOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateSetOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoInput;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>pcmm-service-impl</b>
 * <br />(Source path: <i>META-INF/yang/pcmm-service-impl.yang</i>):
 * <pre>
 * rpc send-gate-delete {
 *     "Shortcut JMX call to send a gate-delete message for testing.";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         leaf result {
 *             type boolean;
 *         }
 *     }
 *     status CURRENT;
 * }
 * rpc send-gate-info {
 *     "Shortcut JMX call to send a gate-info message for testing.";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         leaf result {
 *             type boolean;
 *         }
 *     }
 *     status CURRENT;
 * }
 * rpc send-gate-set {
 *     "Shortcut JMX call to send a gate-set message for testing.";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         leaf result {
 *             type boolean;
 *         }
 *     }
 *     status CURRENT;
 * }
 * rpc send-gate-synchronize {
 *     "Shortcut JMX call to send a gate-Synchronize message for testing.";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         leaf result {
 *             type boolean;
 *         }
 *     }
 *     status CURRENT;
 * }
 * </pre>
 */
public interface PcmmServiceImplService
    extends
    RpcService
{




    /**
     * Shortcut JMX call to send a gate-delete message for testing.
     */
    Future<RpcResult<SendGateDeleteOutput>> sendGateDelete(SendGateDeleteInput input);
    
    /**
     * Shortcut JMX call to send a gate-info message for testing.
     */
    Future<RpcResult<SendGateInfoOutput>> sendGateInfo(SendGateInfoInput input);
    
    /**
     * Shortcut JMX call to send a gate-set message for testing.
     */
    Future<RpcResult<SendGateSetOutput>> sendGateSet(SendGateSetInput input);
    
    /**
     * Shortcut JMX call to send a gate-Synchronize message for testing.
     */
    Future<RpcResult<SendGateSynchronizeOutput>> sendGateSynchronize(SendGateSynchronizeInput input);

}

