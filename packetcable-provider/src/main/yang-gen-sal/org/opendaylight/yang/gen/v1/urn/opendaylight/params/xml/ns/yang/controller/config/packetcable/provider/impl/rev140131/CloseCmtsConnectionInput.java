package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.rpc.context.rev130617.RpcContextRef;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>packetcable-provider-impl</b>
 * <br />(Source path: <i>META-INF/yang/packetcable-provider-impl.yang</i>):
 * <pre>
 * container input {
 *     leaf context-instance {
 *         type instance-identifier;
 *     }
 *     uses rpc-context-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:controller:config:packetcable-provider:impl?revision=2014-01-31)context-instance {
 *             leaf context-instance {
 *                 type instance-identifier;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>packetcable-provider-impl/close-cmts-connection/input</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.CloseCmtsConnectionInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.CloseCmtsConnectionInputBuilder
 */
public interface CloseCmtsConnectionInput
    extends
    RpcContextRef,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.CloseCmtsConnectionInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:packetcable-provider:impl","2014-01-31","input");;


}

