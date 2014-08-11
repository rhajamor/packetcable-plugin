package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.configuration.packetcable.provider.impl.RpcRegistry;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.configuration.packetcable.provider.impl.DataBroker;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.configuration.packetcable.provider.impl.NotificationService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>packetcable-provider-impl</b>
 * <br />(Source path: <i>META-INF/yang/packetcable-provider-impl.yang</i>):
 * <pre>
 * case packetcable-provider-impl {
 *     container rpc-registry {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:packetcable-provider:impl?revision=2014-01-31)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 *     container notification-service {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:packetcable-provider:impl?revision=2014-01-31)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 *     container data-broker {
 *         leaf type {
 *             type service-type-ref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:packetcable-provider:impl?revision=2014-01-31)type {
 *                 leaf type {
 *                     type service-type-ref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>packetcable-provider-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:packetcable-provider:impl?revision=2014-01-31)packetcable-provider-impl</i>
 */
public interface PacketcableProviderImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.configuration.PacketcableProviderImpl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:packetcable-provider:impl","2014-01-31","packetcable-provider-impl");;

    RpcRegistry getRpcRegistry();
    
    NotificationService getNotificationService();
    
    DataBroker getDataBroker();

}

