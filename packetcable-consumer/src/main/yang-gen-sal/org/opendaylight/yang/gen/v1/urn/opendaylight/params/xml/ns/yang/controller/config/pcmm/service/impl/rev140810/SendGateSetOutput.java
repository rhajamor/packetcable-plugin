package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>pcmm-service-impl</b>
 * <br />(Source path: <i>META-INF/yang/pcmm-service-impl.yang</i>):
 * <pre>
 * container output {
 *     leaf result {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>pcmm-service-impl/send-gate-set/output</i>
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateSetOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateSetOutputBuilder
 */
public interface SendGateSetOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateSetOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:pcmm-service:impl","2014-08-10","output");;

    java.lang.Boolean isResult();

}

