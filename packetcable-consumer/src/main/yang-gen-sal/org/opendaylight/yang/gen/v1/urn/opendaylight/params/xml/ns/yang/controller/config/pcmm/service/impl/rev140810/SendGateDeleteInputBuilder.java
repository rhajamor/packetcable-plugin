package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput
 */
public class SendGateDeleteInputBuilder {

    private InstanceIdentifier<?> _contextInstance;

    private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput>> augmentation = new HashMap<>();

    public SendGateDeleteInputBuilder() {
    } 
    
    public SendGateDeleteInputBuilder(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.rpc.context.rev130617.RpcContextRef arg) {
        this._contextInstance = arg.getContextInstance();
    }

    public SendGateDeleteInputBuilder(SendGateDeleteInput base) {
        this._contextInstance = base.getContextInstance();
        if (base instanceof SendGateDeleteInputImpl) {
            SendGateDeleteInputImpl _impl = (SendGateDeleteInputImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.rpc.context.rev130617.RpcContextRef</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.rpc.context.rev130617.RpcContextRef) {
            this._contextInstance = ((org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.rpc.context.rev130617.RpcContextRef)arg).getContextInstance();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.rpc.context.rev130617.RpcContextRef] \n" +
              "but was: " + arg
            );
        }
    }

    public InstanceIdentifier<?> getContextInstance() {
        return _contextInstance;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public SendGateDeleteInputBuilder setContextInstance(InstanceIdentifier<?> value) {
        this._contextInstance = value;
        return this;
    }
    
    public SendGateDeleteInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public SendGateDeleteInput build() {
        return new SendGateDeleteInputImpl(this);
    }

    private static final class SendGateDeleteInputImpl implements SendGateDeleteInput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput.class;
        }

        private final InstanceIdentifier<?> _contextInstance;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput>> augmentation = new HashMap<>();

        private SendGateDeleteInputImpl(SendGateDeleteInputBuilder base) {
            this._contextInstance = base.getContextInstance();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public InstanceIdentifier<?> getContextInstance() {
            return _contextInstance;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.pcmm.service.impl.rev140810.SendGateDeleteInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_contextInstance == null) ? 0 : _contextInstance.hashCode());
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
            SendGateDeleteInputImpl other = (SendGateDeleteInputImpl) obj;
            if (_contextInstance == null) {
                if (other._contextInstance != null) {
                    return false;
                }
            } else if(!_contextInstance.equals(other._contextInstance)) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("SendGateDeleteInput [");
            boolean first = true;
        
            if (_contextInstance != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_contextInstance=");
                builder.append(_contextInstance);
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
