package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput
 */
public class SendGateInfoOutputBuilder {

    private java.lang.Boolean _result;

    private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput>> augmentation = new HashMap<>();

    public SendGateInfoOutputBuilder() {
    } 

    public SendGateInfoOutputBuilder(SendGateInfoOutput base) {
        this._result = base.isResult();
        if (base instanceof SendGateInfoOutputImpl) {
            SendGateInfoOutputImpl _impl = (SendGateInfoOutputImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.Boolean isResult() {
        return _result;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public SendGateInfoOutputBuilder setResult(java.lang.Boolean value) {
        this._result = value;
        return this;
    }
    
    public SendGateInfoOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public SendGateInfoOutput build() {
        return new SendGateInfoOutputImpl(this);
    }

    private static final class SendGateInfoOutputImpl implements SendGateInfoOutput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput.class;
        }

        private final java.lang.Boolean _result;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput>> augmentation = new HashMap<>();

        private SendGateInfoOutputImpl(SendGateInfoOutputBuilder base) {
            this._result = base.isResult();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Boolean isResult() {
            return _result;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateInfoOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_result == null) ? 0 : _result.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            SendGateInfoOutputImpl other = (SendGateInfoOutputImpl) obj;
            if (_result == null) {
                if (other._result != null) {
                    return false;
                }
            } else if(!_result.equals(other._result)) {
                return false;
            }
            if (augmentation == null) {
                if (other.augmentation != null) {
                    return false;
                }
            } else if(!augmentation.equals(other.augmentation)) {
                return false;
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("SendGateInfoOutput [");
            boolean first = true;
        
            if (_result != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_result=");
                builder.append(_result);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
