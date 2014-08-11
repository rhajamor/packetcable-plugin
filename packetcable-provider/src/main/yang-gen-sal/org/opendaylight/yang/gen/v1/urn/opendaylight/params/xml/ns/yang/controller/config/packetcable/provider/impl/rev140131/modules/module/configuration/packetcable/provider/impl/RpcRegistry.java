package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.configuration.packetcable.provider.impl;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>packetcable-provider-impl</b>
 * <br />(Source path: <i>META-INF/yang/packetcable-provider-impl.yang</i>):
 * <pre>
 * container rpc-registry {
 *     leaf type {
 *         type service-type-ref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:controller:config:packetcable-provider:impl?revision=2014-01-31)type {
 *             leaf type {
 *                 type service-type-ref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>packetcable-provider-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:packetcable-provider:impl?revision=2014-01-31)packetcable-provider-impl/rpc-registry</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.configuration.packetcable.provider.impl.RpcRegistryBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.configuration.packetcable.provider.impl.RpcRegistryBuilder
 */
public interface RpcRegistry
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.configuration.packetcable.provider.impl.RpcRegistry>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:packetcable-provider:impl","2014-01-31","rpc-registry");;


}

