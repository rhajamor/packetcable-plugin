package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.pcmm.service.impl;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>pcmm-service-impl</b>
 * <br />(Source path: <i>META-INF/yang/pcmm-service-impl.yang</i>):
 * <pre>
 * container notification-service {
 *     leaf type {
 *         type service-type-ref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:controller:config:pcmm-service:impl?revision=2014-08-10)type {
 *             leaf type {
 *                 type service-type-ref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>pcmm-service-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:pcmm-service:impl?revision=2014-08-10)pcmm-service-impl/notification-service</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.pcmm.service.impl.NotificationServiceBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.pcmm.service.impl.NotificationServiceBuilder
 */
public interface NotificationService
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.modules.module.configuration.pcmm.service.impl.NotificationService>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:pcmm-service:impl","2014-08-10","notification-service");;


}

