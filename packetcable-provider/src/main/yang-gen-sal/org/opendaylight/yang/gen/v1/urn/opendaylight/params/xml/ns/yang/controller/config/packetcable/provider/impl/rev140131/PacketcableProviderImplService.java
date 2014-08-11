package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131;
import java.util.concurrent.Future;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.CloseCmtsConnectionInput;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>packetcable-provider-impl</b>
 * <br />(Source path: <i>META-INF/yang/packetcable-provider-impl.yang</i>):
 * <pre>
 * rpc close-cmts-connection {
 *     "JMX call to close the cmts connection.";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     status CURRENT;
 * }
 * </pre>
 */
public interface PacketcableProviderImplService
    extends
    RpcService
{




    /**
     * JMX call to close the cmts connection.
     */
    Future<RpcResult<java.lang.Void>> closeCmtsConnection(CloseCmtsConnectionInput input);

}

