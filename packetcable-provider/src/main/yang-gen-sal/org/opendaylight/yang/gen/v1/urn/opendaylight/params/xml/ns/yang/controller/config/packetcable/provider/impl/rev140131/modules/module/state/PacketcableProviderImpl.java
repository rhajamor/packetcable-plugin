package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.State;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>packetcable-provider-impl</b>
 * <br />(Source path: <i>META-INF/yang/packetcable-provider-impl.yang</i>):
 * <pre>
 * case packetcable-provider-impl {
 *     leaf connection-state {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>packetcable-provider-impl/modules/module/state/(urn:opendaylight:params:xml:ns:yang:controller:config:packetcable-provider:impl?revision=2014-01-31)packetcable-provider-impl</i>
 */
public interface PacketcableProviderImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl>,
    State
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:packetcable-provider:impl","2014-01-31","packetcable-provider-impl");;

    java.lang.Boolean isConnectionState();

}

